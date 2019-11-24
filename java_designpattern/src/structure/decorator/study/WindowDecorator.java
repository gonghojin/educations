package structure.decorator.study;

// abstract decorator class - Window를 구현하고 있는 점을 주목하자.
abstract class WindowDecorator implements Window {
	protected Window decoratedWindow; // the Window being decorated

	public WindowDecorator(Window decoratedWindow) {
		this.decoratedWindow = decoratedWindow;
	}
}

// vertical scrollbar 기능을 추가하는 concrete decorator 1
class VerticalScrollBarDecorator extends WindowDecorator {
	public VerticalScrollBarDecorator (Window decoratedWindow) {
		super(decoratedWindow);
	}

	@Override
	public void draw() {
		drawVerticalScrollBar();
		decoratedWindow.draw(); // *
	}

	private void drawVerticalScrollBar() {
		// draw the vertical scrollbar
		// 새로운 기능을 부여
	}

	@Override
	public String getDescription() {
		return decoratedWindow.getDescription() + ", including vertical scrollbars";
	}
}

// horizontal scrollbar 기능을 추가하는 concrete decorator 2
class HorizontalScrollBarDecorator extends WindowDecorator {
	public HorizontalScrollBarDecorator (Window decoratedWindow) {
		super(decoratedWindow);
	}

	@Override
	public void draw() {
		drawHorizontalScrollBar();
		decoratedWindow.draw();
	}

	private void drawHorizontalScrollBar() {
		// draw the horizontal scrollbar
		// 새로운 기능을 부여
	}

	@Override
	public String getDescription() {
		return decoratedWindow.getDescription() + ", including horizontal scrollbars";
	}
}