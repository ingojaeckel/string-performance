set dgrid3d;
set grid;
set isosamples 10,10;
set samples 10,10;
set terminal png size 800,600 enhanced font 'Verdana,10';
set output 'performance.png';
set title "Total runtime (ms) of string concatenations"
set xlabel "Number of concatenations"
set ylabel "Number of repetitions"
splot	"withBuilder.txt" using 1:2:3 with lines title "StringBuilder",	\
	"withBuffer.txt" using 1:2:3 with lines title "StringBuffer",	\
	"withoutBuilder.txt" using 1:2:3 with lines title "+";
