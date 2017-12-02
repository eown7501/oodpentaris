package controller;

import java.awt.Graphics;
import model.GameBoard1P;
import model.GameBoard2P;
import model.GameBoardSolo;
import view.ViewTotalFrame;

/**
 * 이 Controller 클래스는 GameBoard Class 와 ViewTotalFrame Class 의 연결을 담당합니다.
 * ViewTotalFrame 객체와 GameBoard 객체는 각자 명령을 Controller 객체에게 전달하거나 전달받습니다.
 * 
 * @author 신승현
 */
public class Controller {

	/** 명령을 받을 TotalFrame Type 의 변수입니다. */
	private ViewTotalFrame totalFrame;
	/** 명령을 전달할 GameBoardSolo Type 의 변수입니다. */
	private GameBoard1P GameBoard1P;
	/** GameMode 를 나타낼 Int Type 변수입니다. */
	private GameBoard2P GameBoard2P;
	/** GameMode 를 나타낼 Int Type 변수입니다. */
	private GameBoardSolo GameBoardSolo;
	/** GameMode 를 나타낼 Int Type 변수입니다. */
	public int gameMode;

	/** ViewTotalFrame이 생성되는 Controller 를 생성합니다. */
	public Controller() {
		gameMode = 0;
		totalFrame = new ViewTotalFrame(this);
	}

	/** Controller 의 멤버변수들을 초기화 합니다. */
	public void init() {
		GameBoard1P = new GameBoard1P(this);

	}

	public void init2() {
		GameBoard2P = new GameBoard2P(this);
	}

	public void initSolo() {
		GameBoardSolo = new GameBoardSolo(this);

	}

	/** Solo Game을 시작합니다. */
	public void startSoloGame() {
		initSolo();
		gameMode = 1;
		GameBoardSolo.startSoloGame();
		totalFrame.showSoloGamePanel();
	}

	/** 2P Game 을 시작합니다. */
	public void start2PGame() {
		init();
		init2();
		gameMode = 2;
		GameBoard1P.startGame();
		GameBoard2P.startGame();
		totalFrame.show2PGamePanel();

	}

	/** AI Game 을 시작합니다. */
	public void startAIGame() {

	}

	/**
	 * soloGameBoard 의 draw 메소드를 실행합니다.
	 * 
	 * @param g
	 *            - totalFrame에서 받은 매개변수 입니다. 이 Graphics g를 GameBoard의 draw 메소드에
	 *            전달합니다.
	 */
	public void draw(Graphics g) {
		GameBoard1P.draw(g);
	}

	public void draw2P(Graphics g) {
		GameBoard2P.draw(g);
	}

	public void drawSolo(Graphics g) {
		GameBoardSolo.drawSolo(g);
	}

	/** totalFrame 의 update 메소드를 실행합니다. */
	public void update() {
		totalFrame.update();
	}

	/** 회전 명령을 전달합니다. */
	public void spin1P() {
		GameBoard1P.spin();
		update();
	}

	public void spin2P() {
		GameBoard2P.spin();
		update();
	}

	public void spinSolo() {
		GameBoardSolo.spin();
		update();
	}

	/** 왼쪽이동 명령을 전달합니다. */
	public void moveLeft1P() {
		GameBoard1P.moveLeft();
		update();
	}

	public void moveLeft2P() {
		GameBoard2P.moveLeft();
		update();
	}

	public void moveLeftSolo() {
		GameBoardSolo.moveLeft();
		update();
	}

	/** 오른쪽 이동 명령을 전달합니다. */
	public void moveRight1P() {
		GameBoard1P.moveRight();
		update();
	}

	public void moveRight2P() {
		GameBoard2P.moveRight();
		update();
	}

	public void moveRightSolo() {
		GameBoardSolo.moveRight();
		update();
	}

	/** 아래이동 명령을 전달합니다. */
	public void moveDown1P() {
		GameBoard1P.moveDown();
		update();
	}

	public void moveDown2P() {
		GameBoard2P.moveDown();
		update();
	}

	public void moveDownSolo() {
		GameBoardSolo.moveDown();
		update();
	}

	/** 바로내림 명령을 전달합니다. */
	public void fastDown1P() {
		GameBoard1P.fastDown();
		update();
	}

	public void fastDown2P() {
		GameBoard2P.fastDown();
		update();
	}

	public void fastDownSolo() {
		GameBoardSolo.fastDown();
		update();
	}

	/** Game 을 일시정지 합니다. */
	public void pause() {
		GameBoard1P.pause();
		GameBoard2P.pause();
		totalFrame.showPausePanel();
	}

	/** Game 을 일시정지 합니다. */
	public void pauseSolo() {
		GameBoardSolo.pause();
		totalFrame.showPausePanelSolo();

	}

	/** Game 을 재개 합니다. */
	public void resume() {
		GameBoard1P.resume();
		GameBoard2P.resume();
		totalFrame.show2PGamePanel();
		update();
	}

	/** Game 을 재개 합니다. */
	public void resumeSolo() {
		GameBoardSolo.resume();
		totalFrame.showSoloGamePanel();
		update();
	}

	/** Game 을 재시작 합니다. */
	public void restart() {
		GameBoard1P.restart();
		GameBoard2P.restart();
		totalFrame.show2PGamePanel();
		update();
	}

	/** Game 을 재시작 합니다. */
	public void restartSolo() {
		GameBoardSolo.restart();
		totalFrame.showSoloGamePanel();
		update();
	}

	/** 메인으로 돌아갑니다. */
	public void goMain() {
		totalFrame.showMainPanel();
	}

	/** SoloGame Over하면 호출됩니다. */
	public void soloGameOver() {
		totalFrame.soloGameOver();
	}

	/** SoloGame Over하면 호출됩니다. */
	public void GameOver2P() {
		totalFrame.ZPGameLose();
	}

}
