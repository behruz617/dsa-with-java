# 🧩 Arrays Package Summary

## ✅ Task 1: Contains Duplicate
**Description:**  
Verilən massivdə təkrarlanan elementlər (rəqəmlər) varsa `true`,  
əks halda `false` qaytarır.

**Notes:**
- 1️⃣ Birinci üsul: `ic-ice for` dövrü ilə müqayisə aparmaq mümkündür (brute force yanaşması).
- 2️⃣ İkinci üsul: **HashSet** istifadə edərək duplikatları daha səmərəli şəkildə tapmaq olar.

---
## ✅ Task 2: Valid Anagram
**Description:**  
Verilən iki `String`-də eyni simvollar **eyni sayda** varsa `true`,  
əks halda `false` qaytarır.  
Simvolların yerləri fərqli ola bilər.
**Approaches:**

1️⃣ **Sort ilə:**
- Hər iki `String`-i `char[]` massivinə çevirib `Arrays.sort()` ilə düzürük,  
  sonra `Arrays.equals()` ilə müqayisə edirik.
- **Time Complexity:** O(n log n)
- **Space Complexity:** O(1)

2️⃣ **HashMap ilə:**
- `s` string-də hər simvolu sayırıq, `t`-də isə həmin sayları azaldırıq.
- Əgər bütün saylar balansda qalırsa → anagramdır.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) *(yalnız 26 hərf üçün)*

---

**Summary:**  
Bu iki tapşırıq **Arrays & Hashing** bölməsinə aiddir və  
HashSet və HashMap istifadəsini öyrənmək üçün əsas nümunələrdir.
