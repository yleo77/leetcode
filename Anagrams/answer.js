var anagrams = function(strs) {
  var ret = [];
  var obj = {};

  strs.forEach(function(str, i) {
    str = str.split('').sort().join('');
    if (!obj[str]) {
      obj[str] = [strs[i]];
    } else {
      obj[str].push(strs[i]);
    }
  });

  Object.keys(obj).forEach(function(str) {

    if (obj[str].length > 1) {
      ret = ret.concat(obj[str]);
    }
  });

  return ret;
};
