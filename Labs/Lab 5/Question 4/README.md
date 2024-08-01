Hashmaps can be used in a variety of ways, most commonly as a dictionary or in advanced algorithms like the MapReduce framework in managing big data.

Your task is to complete the following methods in WordCount.java,
- WordCount constructor: Populates the hashmap dictionary from the story.txt file (do not hardcode the filename into the constructor). All words are in lowercase with no punctuation (use regex to remove the punctuation)
- getCount: Returns the count for a given word. If the word cannot be found, return 0
- hasWord: Returns true if the dictionary has the word, false otherwise
- getWordWithMaxCount: Returns the word with the maximum count in the dictionary (you may assume the word will be unique)
- getAllUniqueWords: Returns a sorted ArrayList of Strings of all unique words in the story.


Sample output when WordCountTester is run:
```
[a, afternoon, afterward, air, among, and, arrived, aside, at, be, beds, been, before, blurs, bullets, bullied, busy, by, castle, chill, colds, damp, dampened, days, drenched, drinker, ears, end, enthusiasm, even, few, fire, flower, for, found, fred, from, garden, gave, george, ginny, greenish, grounds, gryffindor, had, hadnt, hagrids, hair, halloween, happy, harry, head, her, hours, however, impression, instantly, into, it, kept, lake, late, left, like, looking, madam, missiles, more, mud, muddy, new, nimbus, no, not, nurse, october, of, oliver, on, one, ones, over, pale, pepperup, percy, pomfrey, potion, pouring, practice, pumpkins, rain, raindrops, regular, reported, returning, rose, saturday, seen, session, sessions, seven, several, sheds, shooting, size, skin, slytherin, smoking, some, spate, speed, splattered, spreading, spying, staff, steam, stormy, streams, students, sudden, swelled, taking, team, than, that, the, themselves, they, those, though, thousand, through, thundered, to, tower, training, turned, two, under, vivid, was, weasley, which, who, whole, why, wind, windows, with, woods, worked]
7
0
the
true
false
{been=3, practice=1, spying=1, happy=1, shooting=1, percy=1, whole=1, worked=1, pumpkins=1, her=3, fire=1, missiles=1, pale=1, they=1, swelled=1, sessions=1, streams=1, spreading=1, it=2, slytherin=2, splattered=1, at=1, enthusiasm=1, size=2, left=1, even=1, among=1, drinker=1, gave=1, impression=1, looking=1, bullied=1, beds=1, wind=1, saturday=1, be=1, turned=1, harry=1, skin=1, students=1, ginny=1, weasley=1, air=1, pouring=1, two=1, seen=1, arrived=1, into=3, madam=1, found=1, sudden=1, by=2, nurse=1, reported=1, george=1, fred=1, regular=1, bullets=1, a=4, though=1, dampened=1, stormy=1, more=1, muddy=1, one=1, staff=1, team=2, flower=1, the=19, returning=1, hadnt=1, days=2, rose=1, garden=1, oliver=1, hagrids=1, to=4, blurs=1, under=1, thousand=1, through=1, nimbus=1, castle=2, before=1, chill=1, several=1, afterward=1, seven=1, had=3, that=2, instantly=1, halloween=1, late=1, than=1, thundered=1, few=1, from=2, pomfrey=1, spate=1, those=1, tower=1, which=1, greenish=1, rain=1, new=1, like=1, woods=1, colds=1, gryffindor=1, grounds=1, aside=1, october=1, sheds=1, lake=1, mud=1, who=2, however=1, some=1, no=1, session=1, for=4, why=1, training=1, damp=1, vivid=1, speed=1, head=1, hair=1, not=1, and=7, busy=1, of=4, smoking=1, themselves=1, steam=1, end=1, on=4, over=1, potion=1, hours=1, was=7, drenched=1, kept=1, pepperup=1, windows=1, afternoon=1, with=1, ears=1, raindrops=1, ones=1, taking=1}
```

You are advised to look at the HashMap documentation in the Java API for the HashMap methods at your disposal.

Mastery of using the Maps API in general will prove to be useful when you go further into any field within CS in the future. 