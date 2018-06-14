import { Todo } from '../Todo';

export function LoadTodosAction(todos) {
    return {
        type: "LOAD",
        payload: todos,
    }
}

export function AddTodoAction(title) {
    return {
        type: "ADD",
        payload: title
    }
}

export function SetCompletedAction(title, isCompleted) {
    return {
        type: "SET",
        payload: {
            title: title,
            isCompleted: isCompleted,
        }
    };
}

export default (state = [], action) => {
    switch (action.type) {
        case "LOAD": {
            return action.payload;
        }
        case "ADD": {
            const newTodo = new Todo(action.payload, false);
            const newState = [
                ...state,
                newTodo,
            ];
            return newState;
        }
        case "SET": {
            const { title, isCompleted } = action.payload;

            const newState = state.map((todoItem) => {
                if (todoItem.title === title) {
                    return new Todo(title, isCompleted);
                }
                return todoItem;
            })
            return newState;
        }
        default: 
            return state;
    }
}
