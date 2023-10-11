-- 코드를 입력하세요
SELECT F.FLAVOR
FROM FIRST_HALF F
JOIN JULY J
ON J.FLAVOR = F.FLAVOR
GROUP BY FLAVOR
ORDER BY SUM(F.TOTAL_ORDER + J.TOTAL_ORDER) DESC
LIMIT 3;