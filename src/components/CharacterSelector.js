import React, { Component } from 'react';

class CharacterSelector extends Component {

  handleSubmit(event) {
    this.props.onCharacterSubmit({selectedCharacter: selectedCharacter});
  }

  render() {
    const { characters } = this.props;

    let charactersList = characters.length > 0
      && characters.map((item, i) => {
        return (
          <option key={i} value={item.name}>{item.name}</option>
        )
      }, this);

    return (
      <form onSubmit={this.handleSubmit}>
        <label>
          Pick your favourite character
        </label>
        <select>
          {charactersList}
        </select>
        <input type="submit" value="Post"/>
      </form>
    );
  }

}

export default CharacterSelector;
