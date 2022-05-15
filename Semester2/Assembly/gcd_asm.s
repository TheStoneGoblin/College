//Greatest Common Denominator--Assembly

	.globl   gcd_asm
    .p2align 2
	.type    gcd_asm,%function

gcd_asm:
        //X0 X
        //X1 Y

        SUB     sp, sp , #32
        STR     X9, [sp, #0]
        STR     X10, [sp, #8]
        STR     X11, [sp, #16]

        MOV     X9, X0      //X
        MOV     X10, X1     //Y

start:
        CMP     X10, XZR    // Y > 0
        BLE     label1

        CMP     X9, X10     // X < Y
        BGE     label2

        MOV     X11, X9
        MOV     X9, X10     //X
        MOV     X10, X11    //Y

label2:
        SUB     X11, X9, X10
        MOV     X9, X10     //X
        MOV     X10, X11    //Y

        B       start

label1: MOV     X0, x9

        LDR     X11, [sp, #16]
        LDR     X10, [sp, #8]
        LDR     X9, [sp, #0]
        ADD     sp, sp, #32

		br		x30
