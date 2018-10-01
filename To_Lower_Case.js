/**
 * @param {string} str
 * @return {string}
 */
var toLowerCase = function(str) {
    let asciiDifference = "a".charCodeAt() - "A".charCodeAt();    
    for(let i = 0; i < str.length; i++) {
        str[i].charCodeAt() < 91 && str[i].charCodeAt() > 64 ?
            str = str.replace(str[i], String.fromCharCode(str[i].charCodeAt() + asciiDifference)) :
            str = str;
    }
    return str;
};