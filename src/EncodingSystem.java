/*
You have been tasked with implementing an encoding system using the Huffman coding for a stream of
text. This encoding is a mapping from each character in the input stream to a unique bit sequence or
prefix code, which unlike ASCII has variable-length rather than a fixed size. Your system will be given
a string text consisting of only lowercase English letters and spaces (a–z) to be compressed into short
binary codes to more frequent characters and longer codes to less frequent ones.
Huffman Coding heap:
1. Compute frequency of each character,
2. Build a heap, starting with the nodes with the lowest count. The new parent node has the combined
count of its child nodes.
3. The edge from a parent gets '0' for the left child, and '1' for the edge to the right child.
4. Follow the edges from the root node, adding '0' or '1' for each branch, to find the new Huffman
code for each piece of data.
5. Create the Huffman code by converting the data, piece-by-piece, into a binary code using the binary
tree.
Write two classes, Huffman and EncodingSystem. Each class should perform the operations outlined
below:
Class EncodingSystem:
• Create an instance of the Huffman class.
• Initialize a set of texts to be encoded.
• Encode each text and create an array of the encoded strings.
• Perform various operations on the encoded texts: retrieving the highest code, shuffling the
codes in the output, printing all the codes, print all the codes stats
Sample input and Output of a Run of EncodingSystem (input in bold and output in italics):
Input:
texts = ["marcus fenix is a gear”]
A call to highestCode() would return:
“01000111110110101101010010110100100010010110100110010010110101000111100110001001
1111101”
A call to shuffleCodes() would return:
[“01000111110110101101010010110100100010010110100110010010110101000111100110001001
1111101”]
A call to stats() would print to console the stats for each input string:
Stats for “marcus fenix is a gear”
Frequencies:
(space) : 4
a: 3
c: 1
e: 2
f: 1
g: 1
i: 2
m: 1
n: 1
r: 2
s: 2
u: 2
x: 1
Huffman Codes:
(space): 00
a: 111
c: 10111
e: 100
f: 10110
g: 11000
i: 011
m: 01000
n: 01001
r: 1101
s: 1010
u: 0101
x: 11001
Encoded:
010001111101101011010100101101001000100101101001100100101101010001111001100010011
111101
More examples on Huffman coding can be found at:
https://www.w3schools.com/dsa/dsa_ref_huffman_coding.php
 */
public class EncodingSystem {
}
