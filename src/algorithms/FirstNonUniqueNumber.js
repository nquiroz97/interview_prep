//slower time complexity, better space complexity
function firstNonUniqueCharacter_Brute(input) {
  for (let i = 0; i < input.length; i++) {
    for (let j = i + 1; j < input.length; j++) {
      if (input[i] === input[j]) {
        return input[i];
      }
    }
  }
  return undefined;
}

//faster time complexity, less space complexity
function firstNonUniqueCharacter_Efficient(input) {
  let map = {};
  for (let i = 0; i < input.length; i++) {
    if (map[input[i]] !== undefined) {
      return input[i];
    } else {
      map[input[i]] = i;
    }
  }
  return undefined;
}

firstNonUniqueCharacter_Efficient([4, 5, 1, 2, 3, 5, 1]);
