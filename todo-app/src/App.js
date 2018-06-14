import React, { Component } from 'react';
import './App.css';
import { connect } from 'react-redux';
import { Todo } from './Todo';
import { LoadTodosAction } from './reducers/todo-reducer';

class App extends Component {
  componentDidMount() {
    const { loadTodos } = this.props;

    const baseUrl = "http://localhost:8080";

    const req = new XMLHttpRequest();
    req.addEventListener("load", function callback(event) {
      const todos = JSON.parse(this.responseText);
      console.log(todos);
      loadTodos(todos.map(todo => 
        new Todo(todo.title, todo.isCompleted)
      ));
    });
    req.open('get', `${baseUrl}/todo`, true);
    req.send();
  }

  render() {
    return (
      <div className="App">
        <ul>
          {this.props.Todos.map(todoItem => 
            <li>{todoItem.title}</li>)
          }
        </ul>
        <button onClick={() => this.props.addTodo("Hello, world!")}>Add Todo</button>
      </div>
    );
  }
}

function mapStateToProps(state) {
  return {
    Todos: state.Todos,
  };
}

function mapDispatchToProps(dispatch) {
  return {
    loadTodos(todos) {
      dispatch(LoadTodosAction(todos))
    }
  }
}

export default connect(mapStateToProps, mapDispatchToProps)(App);
