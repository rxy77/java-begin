from PIL import Image

img = Image.open("ut.jpg")
o = open("out.txt",'w')

p = img.load()
(max_y,max_x) = img.size

for y in range(0,max_y):
	for x in range(0,max_x):
		if p[x,y]==(0,0,0):
			o.write(f'series.add({x},{max_y-y});\n')
o.flush()
o.close()
