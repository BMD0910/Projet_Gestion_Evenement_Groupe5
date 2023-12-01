import * as React from 'react';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';

function createData(nom,types,description, date, heure, lieu) {
  return { nom,types, description, date, heure, lieu };
}

const rows = [
  createData('Frozen yoghurt', 159, 6.0, 24, 4.0,12),
  createData('Ice cream sandwich', 237, 9.0, 37, 4.3,12),
  createData('Eclair', 262, 16.0, 24, 6.0,12),
  createData('Cupcake', 305, 3.7, 67, 4.3,12),
  createData('Gingerbread', 356, 16.0, 49, 3.9,12),
  createData('Zboss', 356, 16.0, 49, 3.9,12),
];

export default function Mes_Events() {
  return (
    <TableContainer component={Paper}>
      <Table sx={{ minWidth: 650 }} aria-label="simple table">
        <TableHead>
          <TableRow>
            <TableCell >nom</TableCell>
            <TableCell align="right">types</TableCell>
            <TableCell align="right">description</TableCell>
            <TableCell align="right">date</TableCell>
            <TableCell align="right">heure</TableCell>
            <TableCell align="right">lieu</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {rows.map((row) => (
            <TableRow
              key={row.nom}
              sx={{ '&:last-child td, &:last-child th': { border: 1 } }}
            >
              <TableCell component="th" scope="row">
                {row.nom}
              </TableCell>
              <TableCell align="right">{row.types}</TableCell>
              <TableCell align="right">{row.description}</TableCell>
              <TableCell align="right">{row.date}</TableCell>
              <TableCell align="right">{row.heure}</TableCell>
              <TableCell align="right">{row.lieu}</TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
  );
}