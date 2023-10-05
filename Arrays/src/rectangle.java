
public class rectangle {

	//State
	private int Length;
	private int Width;

	//Constructor
	public rectangle(int Length, int Width) {
		this.Length = Length;
		this.Width = Width;

	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}
	public int area() {
		return Length*Width;
	}
	public int perimeter() {
		return 2*(Length+Width);
	}
	@Override
	public String toString() {
		return String.format("Length -%d Width - %d area - %d perimeter - %d", Length, Width,area(),perimeter());

	}

}
