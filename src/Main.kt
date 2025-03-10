/**
 * ===============================================================
 * Kotlin GUI Basic Starter
 * ===============================================================
 *
 * This is a starter project for a simple Kotlin GUI application.
 * The Java Swing library is used, plus the FlatLAF look-and-feel
 * for a reasonably modern look.
 */

import com.formdev.flatlaf.FlatDarkLaf
import java.awt.*
import java.awt.event.*
import javax.swing.*


/**
 * Launch the application
 */
fun main() {
    FlatDarkLaf.setup()     // Flat, dark look-and-feel
    MainWindow()            // Create and show the UI
}


/**
 * Main UI window (view)
 * Defines the UI and responds to events
 * The app model should be passwd as an argument
 */
class MainWindow : JFrame(), ActionListener {

    // Fields to hold the UI elements
    private lateinit var redPLus: JButton
    private lateinit var redMinus: JButton
    private lateinit var bluePlus: JButton
    private lateinit var blueMinus: JButton
    private lateinit var greenPlus: JButton
    private lateinit var greenMinus: JButton
    private lateinit var red: JLabel
    private lateinit var blue: JLabel
    private lateinit var green: JLabel
    private lateinit var redNumber1: TextField
    private lateinit var blueNumber2: TextField
    private lateinit var greenNumber3: TextField
    private lateinit var colourVisual: JPanel
    private lateinit var colourID: JLabel

    /**
     * Configure the UI and display it
     */
    init {
        configureWindow()               // Configure the window
        addControls()                   // Build the UI

        setLocationRelativeTo(null)     // Centre the window
        isVisible = true                // Make it visible
    }

    /**
     * Configure the main window
     */
    private fun configureWindow() {
        title = "Kotlin Swing GUI Demo"
        contentPane.preferredSize = Dimension(500, 350)
        defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        isResizable = false
        layout = null

        pack()
    }

    /**
     * Populate the UI with UI controls
     */
    private fun addControls() {
        val defaultFont = Font(Font.SANS_SERIF, Font.PLAIN, 30)

        colourVisual = JPanel()
        colourVisual.bounds = Rectangle(35, 25, 430, 110)
        colourVisual.font = defaultFont
        colourVisual.background = Color.BLACK
        add(colourVisual)

        colourID = JLabel("....................................")
        colourID.horizontalAlignment = SwingConstants.CENTER
        colourID.bounds = Rectangle(95, 150, 310, 60)
        colourID.font = defaultFont
        add(colourID)

        red = JLabel("R")
        red.horizontalAlignment = SwingConstants.CENTER
        red.bounds = Rectangle(25, 225, 30, 40)
        red.font = defaultFont
        red.background = Color.RED
        red.foreground = Color.RED
        add(red)

        redNumber1 = TextField("0")
        redNumber1.bounds = Rectangle(55, 225, 70, 40)
        redNumber1.font = defaultFont
        redNumber1.background = Color.RED
        redNumber1.foreground = Color.WHITE
        add(redNumber1)

        redPLus = JButton("<")
        redPLus.bounds = Rectangle(25,275,40,50)
        redPLus.font = defaultFont
        redPLus.background = Color.RED
        redPLus.foreground = Color.WHITE
        redPLus.addActionListener(this)     // Handle any clicks
        add(redPLus)

        redMinus = JButton(">")
        redMinus.bounds = Rectangle(75,275,40,50)
        redMinus.font = defaultFont
        redMinus.background = Color.RED
        redMinus.foreground = Color.WHITE
        redMinus.addActionListener(this)     // Handle any clicks
        add(redMinus)

        green = JLabel("G")
        green.horizontalAlignment = SwingConstants.CENTER
        green.bounds = Rectangle(195, 225, 30, 40)
        green.font = defaultFont
        green.background = Color.GREEN
        green.foreground = Color.GREEN
        add(green)

        greenNumber3 = TextField("0")
        greenNumber3.bounds = Rectangle(225, 225, 70, 40)
        greenNumber3.font = defaultFont
        greenNumber3.background = Color.GREEN
        greenNumber3.foreground = Color.WHITE
        add(greenNumber3)

        greenPlus = JButton("<")
        greenPlus.bounds = Rectangle(195,275,40,50)
        greenPlus.font = defaultFont
        greenPlus.background = Color.GREEN
        greenPlus.foreground = Color.WHITE
        greenPlus.addActionListener(this)     // Handle any clicks
        add(greenPlus)

        greenMinus = JButton(">")
        greenMinus.bounds = Rectangle(245,275,40,50)
        greenMinus.font = defaultFont
        greenMinus.background = Color.GREEN
        greenMinus.foreground = Color.WHITE
        greenMinus.addActionListener(this)     // Handle any clicks
        add(greenMinus)

        blue = JLabel("B")
        blue.horizontalAlignment = SwingConstants.CENTER
        blue.bounds = Rectangle(365, 225, 30, 40)
        blue.font = defaultFont
        blue.background = Color.BLUE
        blue.foreground = Color.BLUE
        add(blue)

        blueNumber2 = TextField("0")
        blueNumber2.bounds = Rectangle(395, 225, 70, 40)
        blueNumber2.font = defaultFont
        blueNumber2.background = Color.blue
        blueNumber2.foreground = Color.WHITE
        add(blueNumber2)

        bluePlus = JButton("<")
        bluePlus.bounds = Rectangle(365,275,40,50)
        bluePlus.font = defaultFont
        bluePlus.background = Color.BLUE
        bluePlus.foreground = Color.WHITE
        bluePlus.addActionListener(this)     // Handle any clicks
        add(bluePlus)

        blueMinus = JButton(">")
        blueMinus.bounds = Rectangle(415,275,40,50)
        blueMinus.font = defaultFont
        blueMinus.background = Color.BLUE
        blueMinus.foreground = Color.WHITE
        blueMinus.addActionListener(this)     // Handle any clicks
        add(blueMinus)
    }


    /**
     * Handle any UI events (e.g. button clicks)
     */
    override fun actionPerformed(e: ActionEvent?) {
        when (e?.source) {

              redPLus -> {
                  redNumber1.text = redNumber1.text.toInt().inc().toString()
                  if(redNumber1.text.toInt() > 255)redNumber1.text = "0"
              }
              redMinus -> {
                  redNumber1.text = redNumber1.text.toInt().dec().toString()
                  if(redNumber1.text.toInt() < 0)redNumber1.text = "255"
              }
              greenPlus -> {
                  greenNumber3.text = greenNumber3.text.toInt().inc().toString()
                  if(greenNumber3.text.toInt() > 255)greenNumber3.text = "0"
              }
              greenMinus -> {
                  greenNumber3.text = greenNumber3.text.toInt().dec().toString()
                  if(greenNumber3.text.toInt() < 0)greenNumber3.text = "255"
              }
              bluePlus -> {
                  blueNumber2.text = blueNumber2.text.toInt().inc().toString()
                  if(blueNumber2.text.toInt() > 255)blueNumber2.text = "0"
              }
              blueMinus -> {
                  blueNumber2.text = blueNumber2.text.toInt().dec().toString()
                  if(blueNumber2.text.toInt() < 0)blueNumber2.text = "255"
              }


        }
    }

}

