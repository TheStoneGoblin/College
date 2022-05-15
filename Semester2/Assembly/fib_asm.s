//Fibonacci Sequence--Assembly

.globl   fib_asm
    .p2align 2
	.type    fib_asm,%function

fib_asm:

	cmp		x0, xzr
	bge		label_1
	mov		x0, #-1
	b		end_label

label_1:
	cmp		x0, #20
	ble		label_2
	mov		x0, #-1
	b		end_label

label_2:
	cmp		x0, #2
	bge		label_3
	b		end_label

label_3:

    MOV     X9, XZR     //a
    MOV     X10, #1     //b
    MOV     X11, #2     //i

label_loop:

    CMP     X11, X0
    BGT      end_B
    ADD     X12, X9, X10
    MOV     X9, X10
    MOV     X10, X12
    ADD     X11, X11, #1
    B       label_loop

end_B:
    MOV     X0, X10
    B       end_label

end_label:

	br		x30
