class Deck {
    constructor(deck){
        this.deck = deck;
        this.shuffle;
    }

    shuffle() { // shuffles deck into random order
        var m = this.deck.length,
            t, i;
        while (m) {
            i = Math.floor(Math.random() * m--);
            t = this.deck[m];
            this.deck[m] = this.deck[i];
            this.deck[i] = t;
        }
        console.log("im working!")
        return this;
    }

    deal() {
        return this.deck.pop();
    }

    get getDeck(){
        return this.deck;
    }
}


class Player {
    constructor(name, wreckage_card){
        this.name = name;
        this.health = 3+Math.floor(Math.random()*3)+1;
        this.hand = [];
        this.wreckage_card = wreckage_card;
    }

    drawCard(hearts, frg){
        for(var i = 0; i < hearts; i++){
            this.hand.push(frg.deal());
            this.health--;
        }
    }

    get getHealth(){
        return this.health;
    }

    get getHand(){
        return this.hand;
    }

    get getWreckage(){
      return this.wreckage_card;
    }

    get getName(){
      return this.name;
    }

}







