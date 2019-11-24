package structure.decorator.study;

interface Window {
	public void draw();
	public String getDescription();
}

// ConcreteComponent
class SimpleWindow implements Window {
	public void draw() {
		// draw Window
	}

	public String getDescription() {
		return "simple window";
	}
}