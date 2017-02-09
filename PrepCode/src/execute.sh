# This file is meant to be used to compile the source file, and place
# the .class file in the bin directory.

if [ -z "$1" ]; then
	echo "Enter the name of the app dumbass!"
else
	javac "$1" -d ../bin/
	filename=$(echo $1 | cut -f 1 -d '.')
	java -cp ../bin $filename
fi
