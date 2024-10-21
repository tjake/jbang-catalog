///usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 20+
//PREVIEW
//RUNTIME_OPTIONS -server -Dstdout.encoding=UTF-8 -Djdk.incubator.vector.VECTOR_ACCESS_OOB_CHECK=0
//RUNTIME_OPTIONS --add-modules=jdk.incubator.vector --add-exports java.base/sun.nio.ch=ALL-UNNAMED
//RUNTIME_OPTIONS --enable-native-access=ALL-UNNAMED -XX:+UnlockDiagnosticVMOptions
//RUNTIME_OPTIONS -XX:+AlignVector -XX:+UseStringDeduplication -XX:+UseCompressedOops -XX:+UseCompressedClassPointers
// not possible before https://github.com/jbangdev/jbang/issues/1838 is fixed.
// COMPILE_OPTIONS -XX:CompilerDirectivesFile=%{https://raw.githubusercontent.com/tjake/Jlama/main/inlinerules.json}%

//DEPS com.github.tjake:jlama-cli:0.7.0
//DEPS com.github.tjake:jlama-native:0.7.0:${os.detected.name}-${os.detected.arch}

import static java.lang.System.*;
import com.github.tjake.jlama.cli.JlamaCli;

/**
 * JBANG! script for running jlama-cli
 */
public class jlama {
    public static void main(String... args) {
        JlamaCli.main(args);
    }
}
