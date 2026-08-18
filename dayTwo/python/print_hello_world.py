
text_1 = "Hello"
text_2 = "World"

combined = text_1 + text_2
interleaved = ""
for index in range(2):
    interleaved += text_1[index]
    interleaved += text_2[index]
for index in range(2, 5):
    interleaved += text_2[index]
    interleaved += text_1[index]

print(interleaved)
 

