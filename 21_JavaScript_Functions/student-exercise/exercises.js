/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the student is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * Admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa is above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */

        function isAdmitted(gpa, satScore, recommendation) {
            if (gpa > 4.0 || satScore > 1300 || (gpa > 3.0 && recommendation) || (satScore > 1200 && recommendation)){
                return true;
            } else {
                return false;
            }
        }
    



/**
 * Write a function called useParameterToFilterArray that takes an anonymous
 * function and uses that in the `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
        let unfilteredArray = [1, 2, 3, 4, 5, 6];

        function useParameterToFilterArray(filterFunction) {
            return result = unfilteredArray.filter(filterFunction); 
        }


/**
 * Write a function called makeNumber that takes two strings
 * of digits, concatenates them together, and returns
 * the value as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * returns the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */

        function makeNumber(first, second) {
            return number = parseInt(first.concat(second));
        }




/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds all of them together. Return the sum.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */

    function addAll(num) {
        let sum = 0;
        if (num !== 0) {
            for (i = 0; i < arguments.length; i++) {
                sum += arguments[i];
            }
        }
        return sum;
    }       


/** 
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 * 
 * @param {array} strings an array of strings to add  'Happy ' to
 * @returns {array} newArray is a new array with 'Happy ' in front of each word
 * 
 */
    

    function makeHappy(strings) {
        let newArray = strings.map(word => 'Happy ' + word);
        return newArray;
    }




/** 
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * and returns an array of strings that turns the JavaScript objects
 * into a mailing address in the form of:
 *     streetNumber streetName streetType city state zip
 *
 * Use `map` and an anonymous function.
 * 
 * @param {object[]} addressArray contains string of full address details
 * @param {string} addressArray.streetNumber 
 * @param {string} addressArray.streetName 
 * @param {string} addressArray.streetType 
 * @param {string} addressArray.city 
 * @param {string} addressArray.state 
 * @param {string} addressArray.zip 
 * @returns {string[]} the full address
 */

    
        function getFullAddressesOfProperties(addressArray) {
            return addressArray.map((address) => {
                return newAddress = address.streetNumber+" "+address.streetName+" "+ 
                    address.streetType+" "+address.city+" "+
                    address.state+" "+address.zip;
            });
        }

        





/*
 * Write and document a function called findLargest.
 *
 * Using `forEach`, find the largest element in an array.
 * It must work for strings and numbers.
 */

        function findLargest(array) {
            let largest = array[0];
            //for each element, if the element is greater than the largest, then largest = element
            array.forEach(element => {
                if (element > largest) {
                    largest = element;
                }
            });

            return largest;
        }


/*
 * CHALLENGE
 * Write and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays, adds up all sub values, and returns
 * the sum. For example, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * The function returns 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */


        function getSumOfSubArrayValues(arrayOfArrays=[]) {
            return arrayOfArrays.reduce((grandTotal, innerArray) => {
                //what should i do for each inner array?
                //i should reduce the inner array to its sum and 
                //then add that to the grand total
                return grandTotal + innerArray.reduce( (innerSum, current) => innerSum + current);
                },0);
        }
