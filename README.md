# C***

Programming language based on australian vernacular made from ArnoldC.

## Example Code

	BLIMEY MATE
		I RECKON X = YEAHNAH

		YA RECKON X
			RETAHN YEAHNAH
		EELS
			RETAHN NAHYEAH
	BAIL

## Quick Start

	wget http://lhartikk.github.io/ArnoldC.jar
	echo -e "IT'S SHOWTIME\nTALK TO THE HAND \"hello world\"\nYOU HAVE BEEN TERMINATED" > hello.arnoldc
	java -jar ArnoldC.jar hello.arnoldc
	java hello

To create some "audible" output you can try the -declaim option:

	java -jar ArnoldC.jar -declaim hello.arnoldc
