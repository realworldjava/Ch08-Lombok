package com.wiley.realworldjava.lombok.example14;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokLogging {
    public static void main(String[] args) {
        log.debug("Starting");
        log.info("Hello, Words");
        log.debug("Goodbye");
    }
}

