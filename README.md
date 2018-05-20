When attempting to extend `kotlin.Number` in a KotlinJS project,
the code compiles but fails with a runtime TypeError.

To observe the issue, run `gradle build`, then watch console output
in a browser from loading the file at `resources/main.html`. This code
shows some simple working inheritance of a within-module `abstract class`.

Then, in `Main.kt`, uncomment the `class C` (which extends `Number`),
and the two lines in `main()` which exercise it, and rerun `gradle build`.
When you reload the file it should fail with `TypeError: Number_0 is undefined`
or something along those lines.
