<h2><a href="https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&category=Arrays&sortBy=submissions">Array Leaders</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">You are given an array <strong><code>arr</code></strong> of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:<br></strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr = [16, 17, 4, 3, 5, 2]
<strong>Output: </strong>[17, 5, 2]<strong>
Explanation: </strong>Note that there is nothing greater on the right side of 17, 5 and, 2.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr = [10, 4, 2, 4, 1]
<strong>Output: </strong>[10, 4, 4, 1]<br><strong>Explanation:</strong> Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr = [5, 10, 20, 40]<br><strong>Output: </strong>[40]<br><strong>Explanation:</strong> When an array is sorted in increasing order, only the rightmost element is leader.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr = [30, 10, 10, 5]<br><strong>Output:</strong> [30, 10, 10, 5]<br><strong>Explanation:</strong> When an array is sorted in non-increasing order, all elements are leaders.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 10<sup>6</sup><br>0 &lt;= arr[i] &lt;= 10<sup>6</sup></span></p>
<div id="professor_prebid-root"></div>
<div id="professor_prebid-root"></div></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Payu</code>&nbsp;<code>Adobe</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;