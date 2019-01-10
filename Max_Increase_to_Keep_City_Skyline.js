/**
 * @param {number[][]} grid
 * @return {number}
 */
var maxIncreaseKeepingSkyline = function(grid) {
    let verticalMax = [];
    let horizontalMax = new Array(...grid[0]);
    let maxIncrease = 0;
    for (let i = 0; i < grid.length; i++) {
        let tempMax = grid[i][0];
        for (let j = 0; j < grid[i].length; j++) {
            tempMax = grid[i][j] > tempMax ? grid[i][j] : tempMax;
            horizontalMax[j] = horizontalMax[j] < grid[i][j] ? grid[i][j] : horizontalMax[j];
        }
        verticalMax.push(tempMax);
    }
    
    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[i].length; j++) {
            let currMin = Math.min(verticalMax[i], horizontalMax[j]);
            maxIncrease += currMin > grid[i][j] ? currMin - grid[i][j] : 0;
        }
    }
    return maxIncrease;
};