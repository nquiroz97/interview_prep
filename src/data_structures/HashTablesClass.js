//objects in javascript, set of key-value pairs, key is the index on where to find the value in memory
//Idemopotent 1) faster data access(quick acess), since it'll search by key instead of looping for an index of an array
//SHA-1 is faster than SHA-256
//insert O(1), lookup O(1) or O(n), delete O(1), search O(1)
//downside is, it will not strategically allocate to empty spaces of memory,
//collision will happen, two objects in same address space

let user = {
  age: 54,
  name: "Neri",
  magic: true,
  scream: function () {
    console.log("ahhhhhh");
  },
};

user.age; //O(1)
user.spell = "abra kadabra"; //O(1)
user.scream();

//objects only allows Strings as keys, does not maintain inertion order

const a = new Map(); //allows any datatype as key, maintains insertion order
const b = new Set(); //allows to store key only not value

class HashTable {
  constructor(size) {
    this.data = new Array(size);
    [["grapes", 100000]];
  }

  _hash(key) {
    let hash = 0;
    for (let i = 0; i < key.length; i++) {
      hash = (hash + key.charCodeAt(i) * 1) % this.data.length;
    }
    return hash;
  }

  set(key, value) {
    let address = this._hash(key);
    if (this.data[address]) {
      this.data[address] = [];
      this.data[address].push([key, value]);
    }
    this.data[address].push([key, value]);
    return this.data;
  }

  get(key) {
    let address = this._hash(key);
    const currentBucket = this.data[address];
    if (currentBucket) {
      for (let i = 0; i < currentBucket.length; i++) {
        if (currentBucket[i][0] === key) {
          return currentBucket[i][1];
        }
      }
    }
  }

  keys() {
    const keysArray = [];
    for (let i = 0; i < this.data.length; i++) {
      if (this.data[i]) {
        keysArray.push(this.data[i][0][0]);
      }
    }
    return keysArray;
  }
}

const myHashTable = new HashTable(50);
myHashTable.set("grapes", 10000);
myHashTable.set("apples", 54);
myHashTable.get("grapes");
