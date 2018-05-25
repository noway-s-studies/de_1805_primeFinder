# primeFinder
Prímszám kereső alkalmazás

Genetikus Algoritmus

1. Kezdeti populáció előállítása
 - módszer: a kezdeti értéket egységgel növelve
 - mérete: int határain belül
 
2. Értékeljük 
 - Minden értékre megvizsgáljuk, hogy prím-e. Az osztást 40 alatti prím osztók esetén egyedi metódussal végezzük el.
 - A leggyakoribb osztókat használjuk.
 - Végül minden számmal osztunk mely kisebb a vizsgált szám négyzetgyökénél.

3. Válasszunk ki a fitt egyedeket 

Leggyakoribb elemekkel való osztás előtt a lista előfordulás szerint rendezésre kerül így mindig a leggyakoribb elemmel osztunk.
 - a fittebb egyedek kiválasztása a lista rendezése miatt nagyobb
 
4. Keresztezés
A leggyakoribb osztók egy listába kerülnek. A lista bővül ha még nem található benne az osztó és növekszik az osztóhoz kapcsolt előfordulási érték ha már szerepel a benne.

5. Mutáció (viszonylag kis valószínűséggel)
A minden számmal való osztás fázisában új elemek keletkeznek.

A keresztezés és a mutáció során új egyedek jönnek létre, Az új egyedek segítségével új populáció készól és visszatérünk a 2. pontra.

6. Megállási feltétel
A az int és a lista korlát miatt időnként ürítjük a listát.


