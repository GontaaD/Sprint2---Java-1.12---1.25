package org.tasks.Exceptions;

import java.io.IOException;

public class Checked {
        public static void readFile() throws IOException {
            throw new IOException("File not found");
        }
    }


