/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 @Author: MD. AL AMIN
*/
package CountDown
import javax.swing.*
import java.awt.event.*
import java.util.Date
internal class Counter:JFrame() {
init{
setLocation(500, 300)
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
val THIRTY_MINUTES:Long = 1800000
val sdf = java.text.SimpleDateFormat("mm : ss")
val clock = JLabel(sdf!!.format(Date(THIRTY_MINUTES)), JLabel.CENTER)
val x = 0
val al = object:ActionListener() {
internal var x = THIRTY_MINUTES - 1000
fun actionPerformed(ae:ActionEvent?) {
clock!!.setText(sdf!!.format(Date(x)))
x -= 1000
}
}
javax.swing.Timer(1000, al).start()
val jp = JPanel()
jp!!.add(clock)
getContentPane().add(jp)
pack()
}
companion object {
fun main(args:Array<String>?) {
Counter().setVisible(true)
}
}
}