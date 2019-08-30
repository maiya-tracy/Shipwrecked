var nightCards = [
    {"name": "The Quiet Night",
     "description": "You hear branches breaking in the distance, but nothing comes charging out to kill you tonight.",
     "repercussion_desc": "No repercussion tonight.",
     "repercussion": [{"damage": 0,
                       "no_fire_tomorrow": false,
                       "destroy_shelter": false,
                       "lose_forage": false }],
     "negates_with":false,
     "image": "quiet-night.png"},


    {"name": "The Rain",
     "description": "When it comes to human misery, rain and snow make a great team.",
     "repercussion_desc": "Unsheltered players lose 1 heart. No fire tomorrow night.",
     "repercussion": [{"damage": -1,
                       "no_fire_tomorrow": true, 
                       "destroy_shelter": false, 
                       "lose_forage": false }] , 
     "negates_with":false,
     "image": "rain.png"},


     {"name": "The Bats",
     "description": "A cloud of bloodthirsty creatures comes swarming through camp.",
     "repercussion_desc": "All players lose 1 heart. Fire cancels this event.",
     "repercussion": [{"damage": -1, 
                       "no_fire_tomorrow": false, 
                       "destroy_shelter": false, 
                       "lose_forage": false }] , 
     "negates_with":false,
     "image": "bats.png"},

     {"name": "The Shark",
     "description": "Starved for food, as the tide rolls in a huge shark sniffs out some food left too close to the water.",
     "repercussion_desc": "All players lose 2 hearts. Any shelter is destroyed.",
     "repercussion": [{"damage": -2, 
                       "no_fire_tomorrow": false, 
                       "destroy_shelter": true, 
                       "lose_forage": false }] , 
     "negates_with":"weapon",
     "image": "shark.png"},

     {"name": "The Panther",
     "description": "Bad kitty.",
     "repercussion_desc": "All players lose 2 hearts.",
     "repercussion": [{"damage": -2, 
                       "no_fire_tomorrow": false, 
                       "destroy_shelter": false, 
                       "lose_forage": false }] , 
     "negates_with":"weapon",
     "image": "panther.png"},

     {"name": "The Mountain",
     "description": "A massive wave of rocks, mud, and debris storms down the mountain and into camp. Uninvited, no less.",
     "repercussion_desc": "All players lose 2 hearts. Any shelter is destroyed.",
     "repercussion": [{"damage": -2, 
                       "no_fire_tomorrow": false, 
                       "destroy_shelter": true, 
                       "lose_forage": false }] , 
     "negates_with":false,
     "image": "mountain.png"},

     {"name": "The Whale",
     "description": "A baby whale washes ashore and perishes in the sun. You're too hungry to wonder what happened.",
     "repercussion_desc": "All players recover 3 hearts.",
     "repercussion": [{"damage": 3, 
                       "no_fire_tomorrow": false, 
                       "destroy_shelter": false, 
                       "lose_forage": false }] , 
     "negates_with":false,
     "image": "whale.png"},

     {"name": "The Flood",
     "description": "Distant rainstorms send their waters roaring through camp.",
     "repercussion_desc": "All players lose 2 hearts. Any shelter is destroyed.",
     "repercussion": [{"damage": 0, 
                       "no_fire_tomorrow": true, 
                       "destroy_shelter": true, 
                       "lose_forage": true }] , 
     "negates_with":false,
     "image": "flood.png"},

     {"name": "The Rescue",
     "description": "You've been found.",
     "image": "rescue.png"},

     {"name": "The Gale",
     "description": "The wind blows so hard that you can barely hold on to anything, let alone your sanity.",
     "repercussion_desc": "Unsheltered players lose 1 heart. All players discard 1 forage card.",
     "repercussion": [{"damage": -2, 
                       "no_fire_tomorrow": false, 
                       "destroy_shelter": true, 
                       "lose_forage": true }] , 
     "negates_with":false,
     "image": "gale.png"},
]
var madnessCards = [
    {"name": "Call Me Captain",
     "description": "One night, you mysteriously vanish into the woods. You return the next morning, but you seem different", 
     "effect": "All players must call you as 'Captain Booboo'. Refuse to reply unless you are addressed as such.", 
     "recovery_desc": "Never", 
     "recovery": 0, 
     "steal_forage":0,
     "image": "captain.png"},

     {"name": "Copycat",
     "description": "Pete and Repete are starving in the woods. Petes starves, who is left?", 
     "effect": "You will follow the actions of the player that's on your right regardless of the rules.", 
     "recovery_desc": "Regain at least 1 heart", 
     "recovery": 1,
     "steal_forage":0,
     "image": "copycat.png"},

     {"name": "Busted Ship",
     "description": "You're having flashbacks to a time when you were on a Spaceteam, and someone borrowed one of your space tools.", 
     "effect": "From now on you can only call Forage or Craft items BananaPools", 
     "recovery_desc": "Never", 
     "recovery": 0,
     "steal_forage":0,
     "image": "ship.png"},

     {"name": "Night Terrors",
     "description": "Night falls and everyones asleep. ", 
     "effect": "At the middle of the night you steal 2 forage items from the group.", 
     "recovery_desc": "Upon completion of task", 
     "recovery": 0,
     "steal_forage":2,
     "image": "terror.png"},

     {"name": "Push The Glutton",
     "description": "Comfort food just took on a whole new meaning.", 
     "effect": "You're not satisfied until you steal at least 2 food cards", 
     "recovery_desc": "Upon completion of task", 
     "recovery": 0,
     "steal_forage":2,
     "image": "glutton.png"},

     {"name": "Pyromania",
     "description": "Raining or not, you're gonna burn this mother to the ground.", 
     "effect": "Steal all Wood and Fiber from the group and use it to build a bonfire. This destroys any built Shelters, but the Fire continues to burn through the following night.", 
     "recovery_desc": "Upon completion of task", 
     "recovery": 0,
     "steal_forage":0,
     "image": "pyro.png"},

     {"name": "The Hurt",
     "description": "Madness. Pain.", 
     "effect": "", 
     "recovery_desc": "Upon completion of task", 
     "recovery": -1,
     "steal_forage":0,
     "image": "hurt.png"},

     

     
]
var forgeCards = [
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Helpful] Wood", "action": "Up to you!", "repercussion": 0, "image": "wood.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Useful] Stone", "action": "Up to you!", "repercussion": 0, "image": "stone.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},
    {"type": "craft", "face": "[Functional] Fiber", "action": "Up to you!", "repercussion": 0, "image": "fiber.png"},

    {"type": "food", "face": "[Once You Get Past The Spikes] Sea Urchin", "action": "You regain 1 heart!", "repercussion": 1, "image": "sea-urchin.png"},
    {"type": "food", "face": "[Once You Get Past The Spikes] Sea Urchin", "action": "You regain 1 heart!", "repercussion": 1, "image": "sea-urchin.png"},
    {"type": "food", "face": "[Once You Get Past The Spikes] Sea Urchin", "action": "You regain 1 heart!", "repercussion": 1, "image": "sea-urchin.png"},
    {"type": "food", "face": "[Once You Get Past The Spikes] Sea Urchin", "action": "You regain 1 heart!", "repercussion": 1, "image": "sea-urchin.png"},
    {"type": "food", "face": "[Once You Get Past The Spikes] Sea Urchin", "action": "You regain 1 heart!", "repercussion": 1, "image": "sea-urchin.png"},
    {"type": "food", "face": "[Disgusting and Nutritious] Snail", "action": "You regain 1 heart!", "repercussion": 1, "image": "snail.png"},
    {"type": "food", "face": "[Disgusting and Nutritious] Snail", "action": "You regain 1 heart!", "repercussion": 1, "image": "snail.png"},
    {"type": "food", "face": "[Disgusting and Nutritious] Snail", "action": "You regain 1 heart!", "repercussion": 1, "image": "snail.png"},
    {"type": "food", "face": "[Disgusting and Nutritious] Snail", "action": "You regain 1 heart!", "repercussion": 1, "image": "snail.png"},
    {"type": "food", "face": "[Super Salty] Seaweed", "action": "You regain 1 heart!", "repercussion": 1, "image": "seaweed.png"},
    {"type": "food", "face": "[Super Salty] Seaweed", "action": "You regain 1 heart!", "repercussion": 1, "image": "seaweed.png"},
    {"type": "food", "face": "[Super Salty] Seaweed", "action": "You regain 1 heart!", "repercussion": 1, "image": "seaweed.png"},
    {"type": "food", "face": "[It's Not The Size That Matters] Shrimp", "action": "You regain 1 heart!", "repercussion": 1, "image": "shrimp.png"},
    {"type": "food", "face": "[It's Not The Size That Matters] Shrimp", "action": "You regain 1 heart!", "repercussion": 1, "image": "shrimp.png"},
    {"type": "food", "face": "[It's Not The Size That Matters] Shrimp", "action": "You regain 1 heart!", "repercussion": 1, "image": "shrimp.png"},
    {"type": "food", "face": "[It's Not The Size That Matters] Shrimp", "action": "You regain 1 heart!", "repercussion": 1, "image": "shrimp.png"},
    {"type": "food", "face": "[It's Not The Size That Matters] Shrimp", "action": "You regain 1 heart!", "repercussion": 1, "image": "shrimp.png"},
    {"type": "food", "face": "[A Crustacion Sensation] Hermit Crab", "action": "You regain 1 heart!", "repercussion": 1, "image": "hermit-crab.png"},
    {"type": "food", "face": "[A Crustacion Sensation] Hermit Crab", "action": "You regain 1 heart!", "repercussion": 1, "image": "hermit-crab.png"},
    {"type": "food", "face": "[A Crustacion Sensation] Hermit Crab", "action": "You regain 1 heart!", "repercussion": 1, "image": "hermit-crab.png"},
    {"type": "food", "face": "[Pointy Little Suckers] Starfish", "action": "You regain 1 heart!", "repercussion": 1, "image": "starfish.png"},
    {"type": "food", "face": "[Pointy Little Suckers] Starfish", "action": "You regain 1 heart!", "repercussion": 1, "image": "starfish.png"},


    {"type": "food", "face": "[A Recently Deceased] Crab", "action": "You regain 2 hearts!", "repercussion": 2, "image": "crab.png"},
    {"type": "food", "face": "[A Recently Deceased] Crab", "action": "You regain 2 hearts!", "repercussion": 2, "image": "crab.png"},
    {"type": "food", "face": "[A Recently Deceased] Crab", "action": "You regain 2 hearts!", "repercussion": 2, "image": "crab.png"},
    {"type": "food", "face": "[A Recently Deceased] Crab", "action": "You regain 2 hearts!", "repercussion": 2, "image": "crab.png"},
    {"type": "food", "face": "[Slimey and Yummy] Small Fish", "action": "You regain 2 hearts!", "repercussion": 2, "image": "small-fish.png"},
    {"type": "food", "face": "[Slimey and Yummy] Small Fish", "action": "You regain 2 hearts!", "repercussion": 2, "image": "small-fish.png"},
    {"type": "food", "face": "[Slimey and Yummy] Small Fish", "action": "You regain 2 hearts!", "repercussion": 2, "image": "small-fish.png"},
    {"type": "food", "face": "[Suspicious yet Delicious] Wild Berries", "action": "You regain 2 hearts!", "repercussion": 2, "image": "wild-berries.png"},
    {"type": "food", "face": "[Suspicious yet Delicious] Wild Berries", "action": "You regain 2 hearts!", "repercussion": 2, "image": "wild-berries.png"},
    {"type": "food", "face": "[Suspicious yet Delicious] Wild Berries", "action": "You regain 2 hearts!", "repercussion": 2, "image": "wild-berries.png"},
    {"type": "food", "face": "[Low Hanging Fruit] Banana", "action": "You regain 2 hearts!", "repercussion": 2, "image": "banana.png"},
    {"type": "food", "face": "[Low Hanging Fruit] Banana", "action": "You regain 2 hearts!", "repercussion": 2, "image": "banana.png"},
    {"type": "food", "face": "[Low Hanging Fruit] Banana", "action": "You regain 2 hearts!", "repercussion": 2, "image": "banana.png"},
    {"type": "food", "face": "[Only Rough On The Outside] Calm", "action": "You regain 2 hearts!", "repercussion": 2, "image": "clam.png"},
    {"type": "food", "face": "[Only Rough On The Outside] Calm", "action": "You regain 2 hearts!", "repercussion": 2, "image": "clam.png"},
    {"type": "food", "face": "[Sweet!] Coconut", "action": "You regain 2 hearts!", "repercussion": 2, "image": "coconut.png"},
    {"type": "food", "face": "[Sweet!] Coconut", "action": "You regain 2 hearts!", "repercussion": 2, "image": "coconut.png"},
    {"type": "food", "face": "[Sweet!] Coconut", "action": "You regain 2 hearts!", "repercussion": 2, "image": "coconut.png"},

    {"type": "food", "face": "[Would Be Better As Tacos] Small Group of Fish", "action": "You regain 3 hearts!", "repercussion": 3, "image": "group-of-fish.png"},
    {"type": "food", "face": "[Would Be Better As Tacos] Small Group of Fish", "action": "You regain 3 hearts!", "repercussion": 3, "image": "group-of-fish.png"},
    {"type": "food", "face": "[Freshly Picked] Pineapple", "action": "You regain 3 hearts!", "repercussion": 3, "image": "pineapple.png"},
    {"type": "food", "face": "[Freshly Picked] Pineapple", "action": "You regain 3 hearts!", "repercussion": 3, "image": "pineapple.png"},
    {"type": "food", "face": "[Surf N' Turf Without the Turf] Lobster", "action": "You regain 3 hearts!", "repercussion": 3, "image": "lobster.png"},

    {"type": "uh-oh", "face": "[An Agonizing Discovery] Jellyfish", "action": "You loose 1 heart!", "repercussion": -1, "image": "jellyfish.png"},
    {"type": "uh-oh", "face": "[A Violent Encounter] Squid", "action": "You loose 2 hearts!", "repercussion": -2, "image": "squid.png"},
    {"type": "uh-oh", "face": "[Just Missed Catching That] Empty Hook", "action": "Nothing happens!", "repercussion": 0, "image": "nothing-hooked.png"},
    
    {"type": "bone pile", "face": "Bone Pile", "action": "No meat here!", "repercussion": 0, "image": "bones.png"},
    {"type": "bone pile", "face": "Bone Pile", "action": "No meat here!", "repercussion": 0, "image": "bones.png"},
    {"type": "bone pile", "face": "Bone Pile", "action": "No meat here!", "repercussion": 0, "image": "bones.png"},
    {"type": "bone pile", "face": "Bone Pile", "action": "No meat here!", "repercussion": 0, "image": "bones.png"},

    {"type": "food", "face": "[Shiny Little Psychotropic] Dreamfish", "action": "Draw a madness card and follow the instructions", "repercussion": 0, "image": "dreamfish.png"},
    {"type": "food", "face": "[A Lovely Neurotoxic] Pufferfish", "action": "Cannot use chat until the next day. If you use chat, lost all but 1 of your hearts", "image": "pufferfish.png"},
    {"type": "food", "face": "[It Bit You First] Stonefish", "action": "Lose all but 1 of you hearts", "repercussion": "special", "image": "stonefish.png"}, // special repercussion
    {"type": "food", "face": "[Paralysis Inducing] Lionfish", "action": "Turn your brightness down to 1 until your next turn", "image": "lionfish.png"},
    {"type": "food", "face": "[You Bit It First] Surgeonfish", "action": "You regain 2 hearts!", "repercussion": 2, "image": "surgeonfish.png"},
]


class Deck {
    constructor(deck){
        this.deck = deck;
        this.shuffle;
    }

    shuffle() { //shuffles deck into random order
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

var forgeDeck = new Deck(forgeCards);
var nightDeck = new Deck(nightCards);
var player1 = new Player("Cean", "Tarp");
