//search, lookup, push, insert, delete

class MyArray {
  constructor() {
    this.data = {};
    this.length = 0;
  }

  //method
  push(item) {
    this.data[this.length] = item;
    this.length++;
    return this.length;
  }

  pop() {
    const lastItem = this.data[this.length - 1];
    delete this.data[this.length - 1];
    this.length--;
    return lastItem;
  }

  deleteIndex(index) {
    const item = this.data[index];
    this.shiftItems(index);
  }

  shiftItems(index) {
    for (let i = index; i < this.length - 1; i++) {
      this.data[i] = this.data[i + 1];
    }
    delete this.data[this.length - 1];
    this.length--;
  }
}

function reverseArray(string1) {
  if (!string1 || string1.length < 2 || typeof string1 !== "string") {
    return "That's not valid";
  }

  const backwards = [];
  const totalItems = string1.length - 1;
  for (let i = totalItems; i >= 0; i--) {
    backwards.push(string1[i]);
  }

  return backwards.join(" ");
}

function reverseArray2(string1) {
  return string1.split("").reverse().join("");
}

//reverse array
const reverse3 = (string1) => [...string1].reverse().join("");

function mergeSortedArrays(array1, array2) {
  const mergedArray = [];
  let array1Item = array1[0];
  let array2Item = array2[0];
  let i = 1;
  let j = 1;

  if (array1.length === 0) {
    return array2;
  }
  if (array2.length === 0) {
    return array1;
  }
  while (array1Item || array2Item) {
    if (!array2Item || array1Item <= array2Item) {
      mergedArray.push(array1Item);
      array1Item = array1[i];
      i++;
    } else {
      mergedArray.push(array2Item);
      array2Item = array2[j];
      j++;
    }
  }
  return mergedArray;
}

//initialize array
const strings = ["a", "b", "c", "d"];

//add element (defaults to end of list)
strings.push("e"); //O(1) since not looping through anything

//add element to start of array
strings.unshift("k"); //O(n), depends on the size of the array

//delete element
strings.pop("a"); //0(1)

//add element in the middle of array to a given index
strings.splice(2, 0, "h"); //O(n/2)

const string = "Hi my name is Neri Quiroz";

string.split(" ").reverse().join(" ");
