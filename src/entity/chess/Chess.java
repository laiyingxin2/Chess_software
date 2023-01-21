package entity.chess;

import java.awt.Point;
import java.util.ArrayList;

import entity.Board;
import entity.Coordinate;
//Author ���߷��
//Homepage http://bookshadow.com
public abstract class Chess {
	public static final char ROOK = 'R';
	public static final char KNIGHT = 'K';
	public static final char MINISTER = 'M';
	public static final char ASSISTANT = 'A';
	public static final char GENERAL = 'G';
	public static final char CANNON = 'C';
	public static final char PAWN = 'P';

	public static final char RED = 'r';
	public static final char BLACK = 'b';
	public static final char WHITE = 'w';

	private char color;
	private char code;
	private String name;
	private Point location;
	private Coordinate coordinate;

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public char getCode() {
		return code;
	}

	protected void setCode(char code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public String toString() {
		return this.name + " " + this.coordinate;
	}

	public static char color2Alphabet(char color) {
		return (color == '��') ? 'r' : 'b';
	}

	public static char oppositeColor(char color) {
		if (color == RED)
			return BLACK;
		if (color == BLACK)
			return RED;
		return WHITE;
	}

	public static char name2Code(char name) {
		switch (name) {
		case '��':
			return ROOK; // Rooks
		case '��':
			return KNIGHT; // Knights
		case '��':
		case '��':
			return MINISTER; // Ministers
		case '��':
		case 'ʿ':
			return ASSISTANT; // Assistants
		case '˧':
		case '��':
			return GENERAL; // Generals
		case '��':
		case '�h':
			return CANNON; // Cannons
		case '��':
		case '��':
			return 'P'; // Pawns
		default:
			return 0; // Error
		}
	}

	public boolean isValid(int x, int y) {
		return (x >= 0 && x <= 9 && y >= 0 && y <= 8);
	}

	public abstract ArrayList<Coordinate> getPossibleLocations(Board chessBoard);
	
	public abstract int getValue(Board chessBoard);
}
