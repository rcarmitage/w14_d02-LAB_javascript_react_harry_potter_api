import React, { Component } from "react";
import CharacterSelector from "../components/CharacterSelector";

class CharacterContainer extends Component {

  constructor(props){
    super(props);
    this.state = {
      characters: [],
      selectedCharacter: []
    };
    this.handleCharacterSubmit = this.handleCharacterSubmit.bind(this);
  }

  handleCharacterSubmit(event) {
    event.preventDefault();
    const selectedCharacter = [selectedCharacter];
    this.setState({selectedCharacter: selectedCharacter});
  }

  componentDidMount() {
    fetch('http://hp-api.herokuapp.com/api/characters')
    .then(results => results.json())
    .then(characters => this.setState({characters: characters})
  )}

  render() {
    return (
      <div className='character-container'>
        <CharacterSelector characters={this.state.characters} onCharacterSubmit={this.handleCharacterSubmit}/>
      </div>
    )
  }

}

export default CharacterContainer;
