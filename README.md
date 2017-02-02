# Stopwatch
By Narut Poovorakit

TASK                                               | TIME
---------------------------------------------------|-------------------------:
Append 50000 chars to String                       | 0.833609099
Append 100000 chars to String                      | 3.451233505
Append 100000 chars to StringBuilder               | 0.002904628
Sum 1,000,000,000 double values from an array      | 1.136204063
Sum 1,000,000,000 Double values from an array      | 5.920342107
Sum 1,000,000,000 BigDecimal values from an array  | 11.79259191

Why does appending 100,000 chars to a String take more than 2X the time to append 50,000
chars? Because String must create a new one when it change value and also convert the char to String every time while StringBuilder will append the character and change to String 
when finish append.

Why is appending to StringBuilder so much different than appending to String? What is
happening to the String? String is create a new object since it change the value, so it waste many time and memory. StringBuilder is change 
to the String when finish.

Explain difference in time to sum double, Double, and BigDecimal. Which is faster and
why? double is the fastest because it is the primitive datatype that doesn't need to create new object. BigDecimal is can use in any number 
and much use in mone calculation or monetary.
