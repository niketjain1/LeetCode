/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function(s, t) {
    const n = t.length;
    const m = s.length;
    let i = 0, j = 0;
    while (i < n && j < m) {
        if (s.charAt(j) === t.charAt(i)) {
            i++;
            j++;
            continue;
        }
        i++;
    }
    if (j == m) {
        return true;
    } 
    if (i < n) {
        return false;
    }
    return false;
};