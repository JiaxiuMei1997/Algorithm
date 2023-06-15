<html>
<head>
<title>scratch.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cc7832;}
.s1 { color: #a9b7c6;}
.s2 { color: #6897bb;}
</style>
</head>
<body bgcolor="#2b2b2b">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
scratch.java</font>
</center></td></tr></table>
<pre><span class="s0">public class </span><span class="s1">DigitAnagrams {</span>
    <span class="s0">public static int </span><span class="s1">countDigitAnagramPairs(</span><span class="s0">int</span><span class="s1">[] a) {</span>
        <span class="s0">int </span><span class="s1">count = </span><span class="s2">0</span><span class="s0">;</span>
        <span class="s1">Map&lt;String</span><span class="s0">, </span><span class="s1">Integer&gt; digitFrequencies = </span><span class="s0">new </span><span class="s1">HashMap&lt;&gt;()</span><span class="s0">;</span>

        <span class="s0">for </span><span class="s1">(</span><span class="s0">int </span><span class="s1">num : a) {</span>
            <span class="s1">String sortedDigits = sortDigits(num)</span><span class="s0">;</span>

            <span class="s0">if </span><span class="s1">(digitFrequencies.containsKey(sortedDigits)) {</span>
                <span class="s1">count += digitFrequencies.get(sortedDigits)</span><span class="s0">;</span>
            <span class="s1">}</span>

            <span class="s1">digitFrequencies.put(sortedDigits</span><span class="s0">, </span><span class="s1">digitFrequencies.getOrDefault(sortedDigits</span><span class="s0">, </span><span class="s2">0</span><span class="s1">) + </span><span class="s2">1</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">}</span>

        <span class="s0">return </span><span class="s1">count</span><span class="s0">;</span>
    <span class="s1">}</span>

    <span class="s0">private static </span><span class="s1">String sortDigits(</span><span class="s0">int </span><span class="s1">num) {</span>
        <span class="s0">char</span><span class="s1">[] digits = String.valueOf(num).toCharArray()</span><span class="s0">;</span>
        <span class="s1">Arrays.sort(digits)</span><span class="s0">;</span>
        <span class="s0">return new </span><span class="s1">String(digits)</span><span class="s0">;</span>
    <span class="s1">}</span>
<span class="s1">}</span>

</pre>
</body>
</html>