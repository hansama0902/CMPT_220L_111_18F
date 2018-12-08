package GreedSnake;

import java.awt.Color;

import java.awt.Font;

import java.awt.Frame;

import java.awt.Graphics;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

import java.util.Random;

enum Dir{L, U, R, D};

class Food {

public static int FOODSTYLE = 1;

private int m = r.nextInt(Yard.WIDTH / Yard.B_WIDTH);

private int n = r.nextInt(Yard.HEIGHT / Yard.B_WIDTH - 30/Yard.B_WIDTH) + 30/Yard.B_WIDTH;

public static Random r = new Random();

public int getM() {

return m;

}

public void setM(int m) {

this.m = m;

}

public int getN() {

return n;

}

public void setN(int n) {

this.n = n;

}

public void reAppear() {

this.m = r.nextInt(Yard.WIDTH / Yard.B_WIDTH);

this.n = r.nextInt(Yard.HEIGHT / Yard.B_WIDTH - 30/Yard.B_WIDTH) + 30/Yard.B_WIDTH;

}

public void draw(Graphics g) {

switch (Yard.MAP) {

case 2:

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

{

if(m==j&&n==10)

this.reAppear();

}

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

{

if(m==j&&n==20)

this.reAppear();

}

break;

case 3:

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

{

if(m==j&&n==10)

this.reAppear();

}

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

{

if(m==j&&n==20)

this.reAppear();

}

for (int j = 20; j < 26; j ++)

{

if(m==Yard.WIDTH/Yard.B_WIDTH-10&&n==j)

this.reAppear();

}

for (int j = 5; j < 10; j ++)

{

if(m==10&&n==j)

this.reAppear();

}

break;

default:

break;

}

Color old = g.getColor();

g.setColor(new Color(100, 13, 250));

g.fillOval(m * Yard.B_WIDTH, n * Yard.B_WIDTH, Yard.B_WIDTH,

Yard.B_WIDTH);

g.setColor(old);

}

}

class KeyMonitor extends KeyAdapter {

@Override

public void keyPressed(KeyEvent e) {

int key = e.getKeyCode();

Yard y = (Yard) e.getSource();

y.processKey(key, e);

}

}

class Map {

public static void draw(Graphics g){

Color old = g.getColor();

g.setColor(new Color(100, 0, 0));

switch (Yard.MAP) {

case 1:

break;

case 2:

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

g.fillRect(j*Yard.B_WIDTH, 10*Yard.B_WIDTH, Yard.B_WIDTH, Yard.B_WIDTH);

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

g.fillRect(j*Yard.B_WIDTH, 20*Yard.B_WIDTH, Yard.B_WIDTH, Yard.B_WIDTH);

break;

case 3:

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

g.fillRect(j*Yard.B_WIDTH, 10*Yard.B_WIDTH, Yard.B_WIDTH, Yard.B_WIDTH);

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

g.fillRect(j*Yard.B_WIDTH, 20*Yard.B_WIDTH, Yard.B_WIDTH, Yard.B_WIDTH);

for (int j = 20; j < 26; j ++)

g.fillRect((Yard.WIDTH/Yard.B_WIDTH-10)*Yard.B_WIDTH, j*Yard.B_WIDTH, Yard.B_WIDTH, Yard.B_WIDTH);

for (int j = 5; j < 10; j ++)

g.fillRect(10*Yard.B_WIDTH, j*Yard.B_WIDTH, Yard.B_WIDTH, Yard.B_WIDTH);

break;

default :

break;

}

g.setColor(old);

}

}

class Node {

int w = Yard.B_WIDTH;

int h = Yard.B_WIDTH;

int m;

int n;

Dir d = Dir.L;

Node next = null;

Node pre = null;

Dir dir = Dir.L;

public Node(int m, int n, Dir dir) {

this.dir = dir;

this.n = n;

this.m = m;

}

void draw(Graphics g) {

Random r = new Random();

Color c = g.getColor();

if(Yard.SBODY==2)

g.setColor(new Color(230,0,0));

else

g.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));

g.fillRect(Yard.B_WIDTH * m, Yard.B_WIDTH * n, w-2, h-2);

g.setColor(c);

}

}

class PaintThread extends Thread {

private boolean pause = false;

private int speed = 120;

Yard y;

public PaintThread(Yard y) {

this.y = y;

}

public void go_on() {

this.pause = false;

}

public boolean isPause() {

return pause;

}

public void pause() {

this.pause = true;

}

public void reStart() {

this.install(120);

y.setscore(0);

this.pause = false;

y.s = new Snake(y);

y.setGameover(false);

}

public void install(int i) {

this.speed = i;

}

@Override

public void run() {

while (true) {

if (pause)

continue;

else

y.repaint();

try {

Thread.sleep(speed);

} catch (InterruptedException e) {

e.printStackTrace();

}

}

}

public void setPause(boolean pause) {

this.pause = pause;

}

}

class Snake {

Node head = null;

Node tail = null;

int size = 0;

Yard y;

Node n = new Node(1, 2, Dir.D);

public Snake(Yard y) {

head = n;

tail = n;

size = 1;

this.y = y;

for(int i=0;i<3;i++)

this.Headadd();

}

public void Tailadd() {

Node node = null;

switch (tail.dir) {

case L :

node = new Node(tail.m+1, tail.n, tail.dir);

break;

case U :

node = new Node(tail.m, tail.n+1, tail.dir);

break;

case R :

node = new Node(tail.m-1, tail.n, tail.dir);

break;

case D :

node = new Node(tail.m, tail.n+1, tail.dir);

break;

}

tail.next = node;

node.pre = tail;

tail = node;

size ++;

}

public void Deltail() {

if (size == 0)

return;

tail = tail.pre;

tail.next = null;

}

public void Headadd() {

Node node = null;

switch (head.dir) {

case L:

node = new Node(head.m - 1, head.n, head.dir);

break;

case U:

node = new Node(head.m, head.n - 1, head.dir);

break;

case R:

node = new Node(head.m + 1, head.n, head.dir);

break;

case D:

node = new Node(head.m, head.n + 1, head.dir);

break;

}

node.next = head;

head.pre = node;

head = node;

size++;

}

public void draw(Graphics g) {

if (size <= 0)

return;

move();

for (Node n = head; n != null; n = n.next) {

if(head==n){

g.setColor(Color.BLUE);

if(n.dir==Dir.L||n.dir==Dir.R)

g.fillOval(n.m*Yard.B_WIDTH, n.n*Yard.B_WIDTH, Yard.B_WIDTH, Yard.B_WIDTH-3);

else

g.fillOval(n.m*Yard.B_WIDTH, n.n*Yard.B_WIDTH, Yard.B_WIDTH-3, Yard.B_WIDTH);

}

else

n.draw(g);

}

}

public void Deadif() {

switch(Yard.STYLE){

case 2:

if (head.m < 0 || head.n < 30/Yard.B_WIDTH || head.m >= (Yard.WIDTH / Yard.B_WIDTH)

|| head.n >= (Yard.HEIGHT / Yard.B_WIDTH)) {

y.stop();

}

break;

case 1:

int cols = Yard.WIDTH / Yard.B_WIDTH;

int rows = Yard.HEIGHT / Yard.B_WIDTH;

if(head.m < 0) head.m = cols;

else if (head.m >= cols) head.m = 0;

else if (head.n < 30/Yard.B_WIDTH) head.n = rows;

else if (head.n >= rows) head.n = 30/Yard.B_WIDTH;

break;

}

for (Node p = head.next; p != null; p = p.next) {

if (head.m == p.m && head.n == p.n) {

y.stop();

}

}

switch (Yard.MAP) {

case 1:

break;

case 2:

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

{

if(head.m==j&&head.n==10)

y.stop();

}

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

{

if(head.m==j&&head.n==20)

y.stop();

}

break;

case 3:

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

{

if(head.m==j&&head.n==10)

y.stop();

}

for (int j = 10; j < Yard.WIDTH/Yard.B_WIDTH-10; j ++)

{

if(head.m==j&&head.n==20)

y.stop();

}

for (int j = 20; j < 26; j ++)

{

if(head.m==Yard.WIDTH/Yard.B_WIDTH-10&&head.n==j)

y.stop();

}

for (int j = 5; j < 10; j ++)

{

if(head.m==10&&head.n==j)

y.stop();

}

break;

default:

break;

}

}

void move() {

Yard.MOVECHECK = true;

Headadd();

Deltail();

Deadif();

}

public void eat(Food e) {

if (y.f.getM() == y.s.head.m && y.f.getN() == y.s.head.n){

e.reAppear();

this.Tailadd();

y.setscore(y.getscore() + 5);

}

}

public void keyPressed(KeyEvent e) {

int key = e.getKeyCode();

switch (key) {

case KeyEvent.VK_LEFT:

if (head.dir != Dir.R)

head.dir = Dir.L;

break;

case KeyEvent.VK_UP:

if (head.dir != Dir.D)

head.dir = Dir.U;

break;

case KeyEvent.VK_RIGHT:

if (head.dir != Dir.L)

head.dir = Dir.R;

break;

case KeyEvent.VK_DOWN:

if (head.dir != Dir.U)

head.dir = Dir.D;

break;

}

}

}

class Yard extends Frame {

public static final int WIDTH = 600;

public static final int HEIGHT = 480;

public static final int B_WIDTH = 15;

private int score = 0;

public static int MAP =1;

public static int STYLE =1;

public static int SBODY =1;

public static boolean MOVECHECK= true;

PaintThread th = new PaintThread(this);

private boolean gameover = false;

public boolean isGameover() {

return gameover;

}

public void setGameover(boolean gameover) {

this.gameover = gameover;

}

public Yard(){

Color c = new Color(0,166,0);

this.setTitle("snake");

this.setLocation(200, 200);

this.setSize(WIDTH, HEIGHT);

this.setBackground(c);

this.setResizable(false);

this.setVisible(true);

this.addWindowListener(new WindowAdapter() {

@Override

public void windowClosing(WindowEvent e) {

setVisible(false);

System.exit(0);

}

});

this.addKeyListener(new KeyMonitor());

th.start();

}

Food f = new Food();

Snake s = new Snake(this);

@Override

public void paint(Graphics g) {

Color old = g.getColor();

Map.draw(g);

f.draw(g);

s.draw(g); s.eat(f);

g.setColor(Color.YELLOW);

g.drawString("score:" + score, 10, 60);

g.setFont(new Font("Times New Roman", Font.BOLD, 50));

if (gameover) {

g.setColor(Color.black);

g.fillRect(0, 0, WIDTH, HEIGHT);

g.setColor(Color.YELLOW);

g.drawString("game over！", 200, 180);

g.setFont(new Font("Times New Roman", Font.BOLD, 30));

g.drawString("score:" + score, 10, 60);

th.pause();

}

g.setColor(old);

this.ScoreCheck(g);

}

public void ScoreCheck(Graphics g){

if(score == 30) th.install(90);

if(score ==60) th.install(60);

if(score == 90){

th.install(120);

MAP++;

if(MAP == 4){

g.setColor(Color.black);

g.fillRect(0, 0, WIDTH, HEIGHT);

g.setColor(Color.YELLOW);

g.drawString("Congratulations！", 130, 180);

g.setFont(new Font("Times New Roman", Font.BOLD, 30));

g.drawString("score:" + score, 10, 60);

th.pause();

}

else{

g.setColor(Color.black);

g.fillRect(0, 0, WIDTH, HEIGHT);

g.setColor(Color.YELLOW);

g.drawString("Congratulations！", 130, 180);

g.drawString("Next...", 130, 280);

g.setFont(new Font("Times New Roman", Font.BOLD, 30));

g.drawString("score:" + score, 10, 60);

try {

th.sleep(3000);

} catch (InterruptedException e) {

e.printStackTrace();

}

f.reAppear();

th.reStart();

}

}

}

public void stop() {

gameover = true;

}

public int getscore() {

return score;

}

public void setscore(int i) {

score = i;

}

public void processKey(int key, KeyEvent e) {

if(MOVECHECK){

s.keyPressed(e);

MOVECHECK = false;

}

switch (key) {

case KeyEvent.VK_SPACE:

if (!th.isPause())

th.pause();

else

th.go_on();

break;

case KeyEvent.VK_F1:

th.reStart();

break;

case KeyEvent.VK_1:

th.install(300);

break;

case KeyEvent.VK_2:

th.install(200);

break;

case KeyEvent.VK_3:

th.install(120);

break;

case KeyEvent.VK_4:

th.install(90);

break;

case KeyEvent.VK_5:

th.install(50);

break;

case KeyEvent.VK_F2:

MAP = MAP%3+1;

f.reAppear();

th.reStart();

break;

case KeyEvent.VK_F4:

STYLE = STYLE%2+1;

f.reAppear();

th.reStart();

break;

case KeyEvent.VK_F3:

SBODY = SBODY%2+1;

break;

default :

break;

}

}

}