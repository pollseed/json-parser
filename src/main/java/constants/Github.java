package constants;

public enum Github {
    C_PLUS("C++", "c++", 0),
    PYTHON("Python", "python", 1),
    BASH("Bash", "bash", 12),
    OBJECTIVE_C("Objective-C", "objective-c", 12),
    JAVA("Java", "java", 12),
    SCALA("Scala", "scala", 12),
    PHP("PHP", "php", 12),
    LISP("Lisp", "lisp", 12),
    GO("Go", "go", 12),
    RUBY("Ruby", "ruby", 12),
    C("C", "c", 12),
    PERL("Perl", "perl", 12),
    JAVASCRIPT("JavaScript", "javascript", 12),
    SWIFT("Swift", "swift", 13),
    C_SHARP("C#", "c#", 14),
    ECMA_SCRIPT("ECMAScript", "ecma script", 15),
    GROOVY("Groovy", "groovy", 16),
    LUA("Lua", "lua", 17),
    HASKELL("Haskell", "haskell", 18),
    VISUAL_BASIC("Visual Basic", "visual basic", 19),
    ASSEMBLY("Assembly", "assembly", 20),

    ;
    String responseName;
    String databaseName;
    int value;

    Github(String responseName, String databaseName, int value) {
        this.responseName = responseName;
        this.databaseName = databaseName;
        this.value = value;
    }
}
