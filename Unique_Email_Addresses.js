/**
 * @param {string[]} emails
 * @return {number}
 */
var numUniqueEmails = function(emails) {
  // Periods(.) before the @ does not matter
  // Characters between Additions(+) and @ does not matter
  let uniqueEmails = new Set;
  let tempHolder;
  
  emails.forEach((email) => {
      tempHolder = email.split('@');
      while (tempHolder[0].includes('.')) {
          tempHolder[0] = tempHolder[0].replace('.', '');
      }
      
      if (tempHolder[0].includes('+')) {
          tempHolder[0] = tempHolder[0].substring(0, tempHolder[0].indexOf('+'));
      }
      
      uniqueEmails.add(tempHolder[0].concat(tempHolder[1]));
  });
  return uniqueEmails.size;
};