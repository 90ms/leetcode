class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val map = arrayOf(
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        )
        
        return words.map {
            it.map { 
                e -> map[e-'a']
            }.joinToString("")
        }.toSet().size
    } 
}