import { IMeta, NewMeta } from './meta.model';

export const sampleWithRequiredData: IMeta = {
  id: 17187,
  valor: 350,
  area: 'CIENCIAS_HUMANAS',
};

export const sampleWithPartialData: IMeta = {
  id: 15622,
  valor: 741,
  area: 'CIENCIAS_HUMANAS',
};

export const sampleWithFullData: IMeta = {
  id: 32703,
  valor: 176,
  area: 'LINGUAGENS',
};

export const sampleWithNewData: NewMeta = {
  valor: 497,
  area: 'MATEMATICA',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
