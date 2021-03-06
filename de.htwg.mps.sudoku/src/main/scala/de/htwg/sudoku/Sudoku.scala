package de.htwg.sudoku

import de.htwg.sudoku.model.IGrid
import de.htwg.sudoku.model.impl.Grid
import de.htwg.sudoku.controller.SudokuController
import de.htwg.sudoku.aview.tui.Tui
import de.htwg.sudoku.aview.swing.SwingGui

import scala.io.StdIn._

object Sudoku {
  val grid = new Grid(9)
  val controller = new SudokuController(grid)
  val tui = new Tui(controller)
  val gui = new SwingGui(controller)

  def main(args: Array[String]) {

    while (tui.processInputLine(readLine())) {}
  }

}
