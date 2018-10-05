package project1;

import java.util.*;

import java.lang.*;

import java.io.*;



	/* Name of the class has to be "Main" only if the class is public. */

	class Ideone

	{

	public static void main (String[] args)

	{

	int h = 0;

	int w = 0;

	int b = 0;

	Scanner in = new Scanner(System.in); // Reading from System.in

	h = in.nextInt();

	w = in.nextInt();

	b = in.nextInt();

	boolean complete = false;

	int width = 0;

	int height = 0;

	while (b!=0) {

	b--;

	int s = 0;

	s = in.nextInt();

	if (height < h) {

	width += s;

	if (width == w) {

	++height;

	width = 0;

	} else if (width > w) {

	height = h + 1;

	}

	if (height == h)

	complete = true;

	}

	}

	if (complete)

	System.out.println("yes");

	else

	System.out.println("No");

	}

	}


