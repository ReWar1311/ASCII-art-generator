# ASCII Art Generator

## Overview

This Java program converts images into ASCII art by analyzing the brightness of each pixel and mapping it to a character in a predefined character array. The result is a text-based representation of the input image.

---

## Features

- Reads an image file from a specified path.
- Resizes the image to a manageable width while maintaining the aspect ratio.
- Converts each pixel's brightness into a corresponding ASCII character.
- Outputs the ASCII art directly to the console.

---

## Prerequisites

- Java Development Kit (JDK) installed (version 8 or higher).
- An image file to convert (supported formats include PNG, JPEG, etc.).

---

## Installation

1. Clone the repository or download the code file.
2. Ensure your system has the required JDK installed.
3. Save the code in a file named `ASCIIArt.java`.

---

## Usage

1. Compile the program:
   ```bash
   javac ASCIIArt.java
   ```
2. Run the program:
   ```bash
   java ASCIIArt
   ```
3. Set the string "url" to your image url:

### Example

```bash
String urlString = "C:\\Users\\prash\\Desktop\\LabPractice-Week1106_page4_image.png";
```

The ASCII art will be displayed directly in the console.

---

## Customization

### Character Set

You can modify the `charArray` to include different characters for more or less granularity:

```java
static char[] charArray = { ' ', '.', ',', ':', ';', '+', '*', '?', '%', 'S', '#', '@' };
```

### Resizing Parameters

The resizing logic defaults to a width of 100 pixels. You can adjust this value to control the level of detail:

```java
width = 100;
height = height * 100 / width;
```

---

## Limitations

- The program uses a fixed width for the output, which may affect the aspect ratio for certain images.
- ASCII art is displayed in the console, which might not handle very large images well.

---

## Troubleshooting

- **Error reading the image file**: Ensure the file path is correct and the file is accessible.
- **Output looks distorted**: Try adjusting the `width` variable or modifying the `charArray` for finer control.

---
