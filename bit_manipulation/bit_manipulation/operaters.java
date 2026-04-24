package bit_manipulation;
public class operaters {
    /*
    AND : ALL TRUE -> TRUE
          ALL FALSE -> FALSE
          ONE TRUE AND ONE FALSE -> FALSE
    OR : ALL TRUE -> TRUE
         ALL FALSE -> FALSE
         ONE TRUE AND ONE FALSE -> TRUE
    XOR : ALL TRUE -> FALSE
          ALL FALSE -> FALSE
          ONE TRUE AND ONE FALSE -> TRUE
    NOT : TRUE -> FALSE
           FALSE -> TRUE

     Left Shift :  a << n  -> a * 2^n
     Right Shift : a >> n  -> a / 2^n  // REMOVE LAST n NUMBERS AND ADD n 0's IN THE START
     EXAMPLE : 13 -> 1101
     13 >> 2 => 01 GETS DELETED -> RESULT : 0011

    Bitwise operators are used to manipulate individual bits of data. 
    They are commonly used in low-level programming, 
    such as in embedded systems, device drivers, and 
    performance-critical code. Bitwise operations can 
    be more efficient than their logical counterparts
    when working with binary data, as they operate 
    directly on the bits rather than on higher-level 
    abstractions.

     In Java, bitwise operators include:
     - & (bitwise AND)
     - | (bitwise OR)
     - ^ (bitwise XOR)
     - ~ (bitwise NOT)
     - << (left shift)
     - >> (right shift)
     - >>> (unsigned right shift)

     These operators can be used with integer types (byte, short, int, long) to perform various bit manipulation tasks, such as setting, clearing, toggling, or checking specific bits in a number.
    */
}
