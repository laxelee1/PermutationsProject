#!/bin/bash

# Exit if any command fails
set -e

# Define directories
SRC_DIR="src"
OUT_DIR="out"

echo "Compiling Java files..."
mkdir -p "$OUT_DIR"

javac -d "$OUT_DIR" $(find "$SRC_DIR" -name "*.java")

echo "Compilation complete. Classes are in $OUT_DIR"

echo "Now running permutations.PermutationsMain..."
echo

java -cp "$OUT_DIR" permutations.PermutationsMain
