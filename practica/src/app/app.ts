import { Component } from '@angular/core';
import { ReactiveFormsModule, FormBuilder, FormGroup } from '@angular/forms';

interface Cliente {
  id: number;
  nombre: string;
  email: string;
  telefono?: string;
  direccion?: string;
}

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App {
  title = 'Formulario:';
  clienteForm: FormGroup;
  clientes: Cliente[] = [];
  editandoId: number | null = null;
  private nextId = 1;

  constructor(private fb: FormBuilder) {
    
    this.clienteForm = this.fb.group({
      nombre: [''],
      email: [''],
      telefono: [''],
      direccion: ['']
    });
  }

  
  agregarCliente(): void {
    const data = this.clienteForm.value;
    const cliente: Cliente = { id: this.nextId++, ...data };
    this.clientes.push(cliente);
    this.clienteForm.reset();
  }

  
  editarCliente(c: Cliente): void {
    this.editandoId = c.id;
    this.clienteForm.setValue({
      nombre: c.nombre ?? '',
      email: c.email ?? '',
      telefono: c.telefono ?? '',
      direccion: c.direccion ?? ''
    });
  }


  guardarCambios(): void {
    if (this.editandoId === null) return;
    const index = this.clientes.findIndex(c => c.id === this.editandoId);
    if (index !== -1) {
      this.clientes[index] = { id: this.editandoId, ...this.clienteForm.value };
    }
    this.cancelarEdicion();
  }

 
  cancelarEdicion(): void {
    this.editandoId = null;
    this.clienteForm.reset();
  }

  // Eliminar
  eliminarCliente(id: number): void {
    this.clientes = this.clientes.filter(c => c.id !== id);
    if (this.editandoId === id) this.cancelarEdicion();
  }
}
