<div class="guide-section-description">
      <h6 class="guide-section-title">문제 설명</h6>
      <div class="markdown solarized-dark"><p>한 줄에 K자를 적을 수 있는 메모장에 영어 단어들을 적으려 합니다. 영어 단어는 정해진 순서로 적어야 하며, 단어와 단어 사이는 공백 하나로 구분합니다. 단, 한 줄의 끝에 단어 하나를 완전히 적지 못한다면, 그 줄의 나머지 부분을 모두 공백으로 채우고 다음 줄부터 다시 단어를 적습니다.</p>

<p>예를 들어 한 줄에 10자를 적을 수 있고, 주어진 단어가 순서대로 <code>["nice", "happy", "hello", "world", "hi"]</code> 인 경우 각 줄에 다음과 같이 적을 수 있습니다.('_'는 공백을 나타냅니다.)</p>

<ul>
<li>첫째 줄 : <code>"nice_happy"</code></li>
<li>둘째 줄 : <code>"hello_____"</code></li>
<li>셋째 줄 : <code>"world_hi"</code></li>
</ul>

<p>이때, 둘째 줄에 <code>"hello"</code>를 적으면 단어를 적을 수 있는 남은 칸은 5칸이며, <code>"world"</code>를 이어서 적으려면 공백 하나를 포함하여 총 6칸이 필요합니다. 따라서 단어가 잘리게 되므로 남은 칸을 모두 공백으로 채운 후, 다음 줄에 <code>"world"</code>부터 다시 단어를 적어 나갑니다.</p>

<p>한 줄에 적을 수 있는 글자 수 K와 적을 단어가 순서대로 담긴 배열 words가 매개변수로 주어질 때, 단어를 모두 적으면 몇 줄이 되는지 return 하도록 solution 메소를 완성해주세요.</p>

<hr>

<h5>매개변수 설명</h5>

<p>한 줄에 적을 수 있는 글자 수 K와 적을 단어가 순서대로 담긴 배열 words가 solution 메소드의 매개변수로 주어집니다.</p>

<ul>
<li>K는 5 이상 30 이하인 자연수입니다.</li>
<li>words 배열의 길이는 1 이상 100 이하입니다.</li>
<li>words 배열에 담겨있는 모든 단어는 알파벳 소문자로만 이루어져 있으며, 각 단어의 길이는 K 이하입니다.</li>
</ul>

<hr>

<h5>return값 설명</h5>

<p>단어를 모두 적으면 몇 줄이 되는지 return해주세요.</p>

<hr>

<h5>예제</h5>
<table class="table">
        <thead><tr>
<th>K</th>
<th>words</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>10</td>
<td><code>["nice", "happy", "hello", "world", "hi"]</code></td>
<td>3</td>
</tr>
</tbody>
      </table>
<h5>예제 설명</h5>

<p>예제#1<br>
문제의 예제와 같으며, 단어를 모두 적으면 3줄이 됩니다.</p>
</div>
    </div>