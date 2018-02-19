# Pascal Triangle Kata

## Objective

Create a single application that prints a Pascal Triangle in console given an initial level number. 
 
For example:

Pascal Triangle of level 1 is:
```
1
```
Pascal Triangle of level 2 is:
```
  1
 / \
1   1
```
Pascal Triangle of level 6 is:
```
          1
         / \
        1   1
       / \ / \
      1   2   1
     / \ / \ / \
    1   3   3   1
   / \ / \ / \ / \
  1   4   6   4   1
 / \ / \ / \ / \ / \
1   5  10  10   5   1
```

Pascal Triangle of level 10 is:
```
                    1
                   / \
                  1   1
                 / \ / \
                1   2   1
               / \ / \ / \
              1   3   3   1
             / \ / \ / \ / \
            1   4   6   4   1
           / \ / \ / \ / \ / \
          1   5  10  10   5   1
         / \ / \ / \ / \ / \ / \
        1   6  15  20  15   6   1
       / \ / \ / \ / \ / \ / \ / \
      1   7  21  35  35  21   7   1
     / \ / \ / \ / \ / \ / \ / \ / \
    1   8  28  56  70  56  28   8   1
   / \ / \ / \ / \ / \ / \ / \ / \ / \
  1   9  36  84  126 126 84  36   9   1
 / \ / \ / \ / \ / \ / \ / \ / \ / \ / \
1  10  45  120 210 252 210 120 45  10   1
```
   
Pascal Triangle of level 13 is:
```
                                       1
                                     /   \
                                    1     1
                                  /   \ /   \
                                 1     2     1
                               /   \ /   \ /   \
                              1     3     3     1
                            /   \ /   \ /   \ /   \
                           1     4     6     4     1
                         /   \ /   \ /   \ /   \ /   \
                        1     5    10    10     5     1
                      /   \ /   \ /   \ /   \ /   \ /   \
                     1     6    15    20    15     6     1
                   /   \ /   \ /   \ /   \ /   \ /   \ /   \
                  1     7    21    35    35    21     7     1
                /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
               1     8    28    56    70    56    28     8     1
             /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
            1     9    36    84   126   126    84    36     9     1
          /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
         1    10    45   120   210   252   210   120    45    10     1
       /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
      1    11    55   165   330   462   462   330   165    55    11     1
    /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
   1    12    66   220   495   792   924   792   495   220    66    12     1
 /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
1    13    78    286   715  1287  1716  1716  1287   715   286    78    13     1
```


Pascal Triangle of level 16 is:
```
                                                1                                          
                                              /   \
                                             1     1
                                           /   \ /   \
                                          1     2     1
                                        /   \ /   \ /   \
                                       1     3     3     1 
                                     /   \ /   \ /   \ /   \
                                    1     4     6     4     1 
                                  /   \ /   \ /   \ /   \ /   \
                                 1     5    10    10     5     1 
                               /   \ /   \ /   \ /   \ /   \ /   \
                              1     6    15    20    15     6     1 
                            /   \ /   \ /   \ /   \ /   \ /   \ /   \
                           1     7    21    35    35    21     7     1 
                         /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
                        1     8    28    56    70    56    28     8     1
                      /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
                     1     9    36    84   126   126    84    36     9     1
                   /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
                  1    10    45   120   210   252   210   120    45    10     1
                /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
               1    11    55   165   330   462   462   330   165    55    11     1
             /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
            1    12    66   220   495   792   924   792   495   220    66    12     1
          /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
         1    13    78   286   715  1287  1716  1716  1287   715   286    78    13     1
       /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
      1    14    91   364  1001  2002  3003  3432  3003  2002  1001   364    91    14     1
    /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
   1    15   105   455  1365  3003  5005  6435  6435  5005  3003  1365   455   105    15     1
 /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \ /   \
1    16   120   560  1820  4368  8008 11440 12870 11440  8008  4368  1820   560   120    16     1
```

## Preconditions and restrictions

1. Your solution should provide all acceptance tests and Unit Tests.
2. Prepare your code to print in different outputs like a File
3. Consider the possibility to print using different formats like single triangle (without "/" and "\" symbols), 
   single lines and html, xml, json formats.
 
