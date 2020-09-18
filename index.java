void setup() {
	size(400, 400);
}

void draw() {
  background(0)   
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  // monkeys ears
  fill(130, 75, 5); 
  ellipse(90, 110, 50, 50); 
  fill(130, 75, 5);
  ellipse(310, 110, 50, 50);
 // monkeys inner ears
  fill(255, 200, 200);
  ellipse(100, 115, 30, 30);
  ellipse(300, 115, 30, 30);
  // monkeys body
  fill(130, 75, 5);
  ellipse(200, 330, 500, 250)
  // monkeys head
  fill(130, 75, 5);
  ellipse(200, 150, 200, 200);
  // monkeys lower lip
  fill(230, 40, 40);
  ellipse(200, 190, 100, 39);
  // monkeys upper lip
  fill(235, 45, 45);
  rect(200, 180, 100, -20); 
  // monkeys outer eye 
  fill(255);
  ellipse(170, 110, 35, 35);
  fill(255);
  ellipse(230, 110, 35, 35);
  // monkeys eye color
  fill(0, 200, 200);
  ellipse(170, 110, 25, 25);
  fill(0, 200, 200);
  ellipse(230, 110, 25, 25);
  // monkeys left nostril
  fill(0);
  ellipse(190, 145, 10, 10);
  // monkeys black part of the eye (left)
  fill(0);
  ellipse(170, 110, 10, 10);
	// monkeys black part of the eye (right)
  fill(0);
  ellipse(235, 115, 10, 10);
  // monkeysright nostrile 
  ellipse(210, 145, 10, 10);
  // monkeys outer nipples
  fill(255, 200, 200);
  ellipse(110, 350, 30, 30);
  ellipse(290, 350, 30, 30);
  // monkeys inner nipples
  fill(205, 110, 110);
  ellipse(110, 350, 15, 15);
  ellipse(290, 350, 15, 15);
}



